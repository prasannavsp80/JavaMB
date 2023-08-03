import logo from './logo.svg';
import './App.css';
import UserShow from './components/userShow/userShow';
import UserSearch from './components/userSearch/userSearch';
import StateExample from './components/stateExample/stateExample'
import StateExample2 from './components/stateExample2/stateExample2'
import EffectExample from './components/useEffectEx1/useEffectEx1'
import Custom from './components/custom/custom'
function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <p>
          <StateExample2 />
        </p>
        <p>
          <UserShow />
        </p>
        <p>
          <Custom />
        </p>
        <p>
          <UserSearch />
        </p>
        <p>
          <StateExample />
        </p>
        <p>
          <EffectExample />
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
