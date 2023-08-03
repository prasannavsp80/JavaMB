import React, {Component} from 'react';
import  axios  from 'axios';
import './userSearch.scss'
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as userSearchActions from "../../store/userSearch/actions";
export default class userSearch extends Component {
  constructor(props) {
    super(props);
    this.state = {
      users : {}
    };
}
handleSubmit = () => {
  const {users} = this.state

 // alert("Welcome to " +this.state.value)
  axios.get("https://jsonplaceholder.typicode.com/users/" +this.state.value)
  .then(response => {
    this.setState({
      users : response.data 
    })
    // alert(users);
    console.log(response.data)
  })
}
handleChange = (event) => {
this.setState({value: event.target.value});
}
render() {
  const {users} = this.state
return <div className="component-post-service">
  <form>
  <label>
     Id:
     <input type="text" value={this.state.value} onChange={this.handleChange} />
   </label>
   <input type="button" value="Submit" onClick={this.handleSubmit} />
</form>
Id :      {users.id} <br/>
Name : {users.name} <br/>
User Name : {users.username}
</div>;

}

  }
// export default connect(
//     ({ userSearch }) => ({ ...userSearch }),
//     dispatch => bindActionCreators({ ...userSearchActions }, dispatch)
//   )( userSearch );