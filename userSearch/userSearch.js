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
componentDidMount() {
  axios.get("https://jsonplaceholder.typicode.com/users/1")
  .then(response => {
    this.setState({
      users : response.data 
    })
    console.log(response.data)
  })
}
render() {
          const {users} = this.state
  return <div className="component-post-service">
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