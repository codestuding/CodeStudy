import { useState } from 'react';
import './App.css';

function App() {
  const [title, setTitle] = useState('');
  const [content, setContent] = useState('');
  const [date, setDate] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault(); // 폼 제출 시 새로고침 방지
    console.log('📌 스터디 기록:', { title, content, date });

    // 입력 초기화
    setTitle('');
    setContent('');
    setDate('');
    
    const markdown = `# ${title}

    📅 날짜: ${date}
    
    ---
    
    ${content}
    `;
    
    const blob = new Blob([markdown], { type: 'text/markdown;charset=utf-8' });
    const url = URL.createObjectURL(blob);
    const a = document.createElement('a');
    a.href = url;
    a.download = `${date}_${title}.md`;
    a.click();
    URL.revokeObjectURL(url);
  };

  return (
    <div className="App">
      <h1>🌱 나의 스터디 기록</h1>
      <form onSubmit={handleSubmit} style={{ display: 'flex', flexDirection: 'column', width: '300px', margin: '0 auto' }}>
        <label>제목</label>
        <input
          type="text"
          value={title}
          onChange={(e) => setTitle(e.target.value)}
          required
        />

        <label>내용</label>
        <textarea
          value={content}
          onChange={(e) => setContent(e.target.value)}
          required
        />

        <label>날짜</label>
        <input
          type="date"
          value={date}
          onChange={(e) => setDate(e.target.value)}
          required
        />

        <button type="submit" style={{ marginTop: '10px' }}>작성하기</button>
      </form>
    </div>
  );
}

export default App;
