import {React, useState} from 'react';

// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as usestate1Actions from "../../store/usestate1/actions";
  
  const FunctionalComponent = () => {
      const [count, setCount] = useState(0);
  
      const increase = () => {
          setCount(count + 1);
      }
  
      return (
          <div style={{ margin: '50px' }}>
              <h1>Welcome to Geeks for Geeks </h1>
              <h3>Counter App using Functional Component : </h3>
        
              <h2>{count}</h2>
              <button onClick={increase}>Add</button>
          </div>
      )
  }  

  export default FunctionalComponent