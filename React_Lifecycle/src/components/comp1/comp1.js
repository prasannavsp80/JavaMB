import React, {Component} from 'react';
import './comp1.scss'
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as comp1Actions from "../../store/comp1/actions";
export default class comp1 extends Component {
  constructor(props) {
    super(props);
    this.state = {favoritecolor: "red"};
  }
  render() {
    return (
      <h1>My Favorite Color is from First Component Data is {this.state.favoritecolor}</h1>
    );
  }
  }
// export default connect(
//     ({ comp1 }) => ({ ...comp1 }),
//     dispatch => bindActionCreators({ ...comp1Actions }, dispatch)
//   )( comp1 );