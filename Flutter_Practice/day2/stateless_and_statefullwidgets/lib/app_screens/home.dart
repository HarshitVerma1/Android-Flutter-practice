import 'package:flutter/material.dart';

class MyHomePage extends StatefulWidget {
  @override
  _MyHomePageState createState() => _MyHomePageState();
}

// class _MyHomePageState extends State<MyHomePage> {
//   String name = "";
//   @override
//   Widget build(BuildContext context) {
//     return Center(
//       child: Column(
//         children: [
//           TextField(
//             onSubmitted: (value) {
//               // setState(() {
//               //   name = value;
//               //   print(value);
//               // });

//               onChanged:
//               ((value) {
//                 name = value;
//                 print(value);
//               });
//             },
//           ),
//           Text(
//             name,
//             textDirection: TextDirection.ltr,
//             style: TextStyle(fontSize: 30),
//           )
//         ],
//       ),
//     );
//   }
// }

class _MyHomePageState extends State<MyHomePage> {
  final _formkey = GlobalKey<FormState>();
  var name = "";
  var email = "";
  var password = "";
  final nameController = TextEditingController();
  final emailController = TextEditingController();
  final passwordController = TextEditingController();
  @override
  Widget build(BuildContext context) {
    // TODO: implement build
    return Form(
        child: Padding(
      padding: EdgeInsets.symmetric(vertical: 40, horizontal: 30),
      child: ListView(
        children: [
          TextFormField(
            decoration: InputDecoration(
                labelText: 'Name: ',
                labelStyle: TextStyle(fontSize: 20),
                errorStyle: TextStyle(color: Colors.redAccent, fontSize: 15)),
            controller: nameController,
            validator: (value) {
              if (value!.isEmpty) {
                return 'Please Enter valid Name!!!';
              }
            },
          ),
          TextFormField(
            decoration: InputDecoration(
                labelText: 'Email: ',
                labelStyle: TextStyle(fontSize: 20),
                errorStyle: TextStyle(color: Colors.redAccent, fontSize: 15)),
            controller: emailController,
            validator: (value) {
              if (value!.isEmpty) {
                return 'Please Enter Email!!!';
              } else if (!value.contains("@")) {
                return "Please Enter Valid Email!!!";
              }
            },
          ),
          TextFormField(
            obscureText: true, //for dot dot dot ***** in password
            decoration: InputDecoration(
                labelText: 'Password: ',
                labelStyle: TextStyle(fontSize: 20),
                errorStyle: TextStyle(color: Colors.redAccent, fontSize: 15)),
            controller: passwordController,
            validator: (value) {
              if (value!.isEmpty) {
                return 'Please Enter valid Password!!!';
              }
            },
          ),
          ElevatedButton(
              onPressed: () {
                if (_formkey.currentState!.validate()) {
                  setState(() {
                    name = nameController.text;
                    email = emailController.text;
                    password = passwordController.text;
                  });
                } else {
                  print("Enter valid value!");
                }
              },
              child: Text("Submit")),
          Text("Name: $name"),
          Text("Name: $email"),
          Text("Name: $password"),
        ],
      ),
    ));
  }
}
