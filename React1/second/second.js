import React, {Component} from 'react';
import './second.scss'
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as secondActions from "../../store/second/actions";
export default class second extends Component {
    // constructor(props) {
    //     super(props);
    //     this.state = {};
    // }
    render() {
      return <div className="component-second">Hello! component second compnay MayBank Labs</div>;
    }
  }
// export default connect(
//     ({ second }) => ({ ...second }),
//     dispatch => bindActionCreators({ ...secondActions }, dispatch)
//   )( second );