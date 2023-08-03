import React, {Component} from 'react';
import './comp3.scss'
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as comp3Actions from "../../store/comp3/actions";
export default class comp3 extends Component {
  constructor(props) {
    super(props);
    this.state = {favoritecolor: "red"};
  }
  componentDidMount() {
    setTimeout(() => {
      this.setState({favoritecolor: "yellow"})
    }, 3000)
  }
  render() {
    return (
      <h1>My Favorite Color in Third Component is {this.state.favoritecolor}</h1>
    );
  }

  }
// export default connect(
//     ({ comp3 }) => ({ ...comp3 }),
//     dispatch => bindActionCreators({ ...comp3Actions }, dispatch)
//   )( comp3 );