import React, {Component} from 'react';
import './employform.scss'
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as employformActions from "../../store/employform/actions";
export default class employform extends Component {
    constructor(props) {
        super(props);
        this.state = {
          firstName :'',
          lastName : '',
          fullName : ''
        };
    }

    handleSubmit = () => {
      let result = this.state.firstName + " " +this.state.lastName;
      this.setState({
        fullName : result
      })
    }

    changeFirstName = (event) => {
      this.setState({  
        firstName: event.target.value
    });  
    }

    changeLastName = (event) => {
      this.setState({
        lastName:event.target.value
      })
    }
    render() {
         return (
        <form onSubmit={this.handleSubmit}>
          <table border="3">
            <tr>
              <th>First Name</th>
              <td> 
                <input type="text" id="firstName" value={this.state.firstName}
                 onChange={this.changeFirstName} />
              </td>
            </tr>
            <tr>
              <th>Last Name</th>
              <td>
              <input type="text" id="lastName" value={this.state.lastName}
               onChange={this.changeLastName} />
              </td>
            </tr>
            <tr>
              <th>Full Name</th>
              <td>
              <input type="text" id="fullName" value={this.state.fullName}
               onChange={this.changeFullName} />
              </td>
            </tr>
            <tr>
              <th colSpan="2">
                <input type="submit" value="Show"/>
              </th>
            </tr>
          </table>
         
      </form>
      );
  
    }
  }
// export default connect(
//     ({ employform }) => ({ ...employform }),
//     dispatch => bindActionCreators({ ...employformActions }, dispatch)
//   )( employform );