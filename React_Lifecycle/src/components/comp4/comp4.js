import React, {Component} from 'react';
import './comp4.scss'
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as comp4Actions from "../../store/comp4/actions";
export default class comp4 extends Component {
    // constructor(props) {
    //     super(props);
    //     this.state = {};
    // }
    render() {
      return <div className="component-comp4">Hello! component comp4</div>;
    }
  }
// export default connect(
//     ({ comp4 }) => ({ ...comp4 }),
//     dispatch => bindActionCreators({ ...comp4Actions }, dispatch)
//   )( comp4 );