import React, {Component} from 'react';
import './dropdown.scss'
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as dropdownActions from "../../store/dropdown/actions";
export default class dropdown extends Component {
    constructor(props) {
        super(props);
        this.state = {value: 'Kavya'};
    }

    handleChange = (event) => {
      let res = event.target.value;
//      alert(event.target.value);
        this.setState({value:event.target.value});
  //    this.setState({value: event.target.value});
      alert('Selected Student Name is : ' + res);
    }
    render() {
      return (
        <div>
        <form>
        <label>
          Select Student Name :
          <select value={this.state.value} onChange={this.handleChange}>
            <option value="Shubham">Shubham</option>
            <option value="Kavya">Kavya</option>
            <option value="Srikanth">Srikanth</option>
            <option value="Shrivas">Shrivas</option>
          </select>
        </label>
      </form>
      </div>
      );
    }
  }
// export default connect(
//     ({ dropdown }) => ({ ...dropdown }),
//     dispatch => bindActionCreators({ ...dropdownActions }, dispatch)
//   )( dropdown );