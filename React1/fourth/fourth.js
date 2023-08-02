import React, {Component} from 'react';
import './fourth.scss'
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as fourthActions from "../../store/fourth/actions";
export default class fourth extends Component {
    // constructor(props) {
    //     super(props);
    //     this.state = {};
    // }
    render() {
      return <div className="component-fourth">
        First Name is {this.props.firstName} 
        Last Name is {this.props.lastName}
      </div>;
    }
  }
// export default connect(
//     ({ fourth }) => ({ ...fourth }),
//     dispatch => bindActionCreators({ ...fourthActions }, dispatch)
//   )( fourth );