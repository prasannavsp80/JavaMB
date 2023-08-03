import logo from './logo.svg';
import './App.css';
import Comp1 from './components/comp1/comp1';
import Comp2 from './components/comp2/comp2';
import Comp3 from './components/comp3/comp3';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <p>
          <Comp1 />
        </p>
      <p>
        <Comp2 />
      </p>
      <p>
        <Comp3 />
      </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
}

export default App;
