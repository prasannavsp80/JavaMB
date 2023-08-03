import React, {Component} from 'react';
import './comp2.scss'
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as comp2Actions from "../../store/comp2/actions";
export default class comp2 extends Component {
  constructor(props) {
    super(props);
    this.state = {favoritecolor: "red"};
  }
  static getDerivedStateFromProps(props, state) {
    return {favoritecolor: "blue" };
  }
  render() {
    return (
      <h1>My Favorite Color from Second Component is {this.state.favoritecolor}</h1>
    );
  }


  }
// export default connect(
//     ({ comp2 }) => ({ ...comp2 }),
//     dispatch => bindActionCreators({ ...comp2Actions }, dispatch)
//   )( comp2 );