import { useState } from "react";
import axios from 'axios';

function App() {
  const[equation, setEquation] = useState("");
  const[result, setResult] = useState(null);

  const calculate = async() => {
    const response = await axios.post('http://localhost:8080/calculate', equation, {
      headers: {'Content-Type': 'text/plain'}
    });
    setResult(response.data);
  };
  return (
  <div>
    <h1>Calculator App</h1>
    <input type="text" value={equation} onChange={e=> setEquation(e.target.value)}
    placeholder="Enter equation" />
    <button onClick={calculate}>Calculate</button>
      {result !== null && <p>Result: {result}</p>}
    </div>
  );
}

export default App
