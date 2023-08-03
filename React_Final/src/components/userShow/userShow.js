import React, {Component} from 'react';
import './userShow.scss'
import  axios  from 'axios';

export default class userShow extends Component {
    constructor(props) {
      super(props);
      this.state = {
        users : []
      };
    }

    componentDidMount() {
      axios.get("https://jsonplaceholder.typicode.com/users")
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
        <table border="3" align='center'>
          <tr>
            <th>Id</th>
            <th>Name</th>
            <th>UserName</th>
            <th>Email</th>
            <th>Phone</th>
            <th>Website</th>
          </tr>
          {
            users.map( user => 
              <tr>
                <td>{user.id}</td>
                <td>{user.name}</td>
                <td>{user.username}</td>
                <td>{user.email}</td>
                <td>{user.phone}</td>
                <td>{user.website}</td>
              </tr>
          )
          }
        </table>
        </div>;
    }
  }
// export default connect(
//     ({ userShow }) => ({ ...userShow }),
//     dispatch => bindActionCreators({ ...userShowActions }, dispatch)
//   )( userShow );