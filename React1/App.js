import logo from './logo.svg';
import './App.css';
import First from './components/first'
import Second from './components/second/second';
import Third from './components/third/third';
import Fourth from './components/fourth'
import Fifth from './components/fifth/fifth';
import ButtonExample from './components/buttonexample/buttonexample';
import NameForm from './components/nameform/nameform';
import EmployForm from './components/employform/employform';
import Calcform from './components/calcform/calcform';
import DropDown from './components/dropdown/dropdown';
import {
  BrowserRouter,
  Routes,
  Route,
  Link,
  Outlet
} from "react-router-dom";

function App() {
  return (
    <div className="App">
            <h2>Welcome to React Router Tutorial</h2>
      <BrowserRouter>
      {/* <Link to="/">First</Link>{' '} */}
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/first">First</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/second">Second</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/third">Third</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/fourth">Fourth</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/fifth">Fifth</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/nameForm">Name Form</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/calcForm">Calculation Form</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/employForm">Employ Form</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/dropDownForm">DropDown Form</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

      {/* <Link to="/six">six</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/seven">seven</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; */}
      <Link to="/button">Button Example</Link>
      <Routes>
        {/* <Route path="/menu" element={<Menu />} /> */}
        <Route path="/first" element={<First />} />
        <Route path="/second" element={<Second />} />
        <Route path="/third" element={<Third />} />
        <Route path="/fourth" element={<Fourth firstName="Prasanna" lastName="Pappu" />} />
        <Route path="/fifth" element={ <Fifth></Fifth>} />
        <Route path="/nameForm" element={ <NameForm></NameForm>} />
        <Route path="/employForm" element={ <EmployForm></EmployForm>} />
        <Route path="/calcForm" element={<Calcform/>} />
        <Route path="/dropDownForm" element={<DropDown/>} />
        <Route path="/button" element={<ButtonExample />} />
      </Routes>

      </BrowserRouter>

      {/* <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <p>
          Welcome to ReactJs...Prasanna Trainer Thank You
        </p>
        <First></First>
        <Second></Second>
        <Third></Third>
        <Fourth></Fourth>
        <Fifth></Fifth>
        <ButtonExample></ButtonExample>
        <FormExampleNew></FormExampleNew>
        <StudentForm></StudentForm>
        <Six user="Prasanna"></Six>
        <Seven firstName="Prasanna" lastName="Pappu"></Seven>
        <NameForm></NameForm>
        <MultiForm></MultiForm>
        <Calc></Calc>
        <DropDown></DropDown>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header> */}
    </div>
  );
    }
export default App;
