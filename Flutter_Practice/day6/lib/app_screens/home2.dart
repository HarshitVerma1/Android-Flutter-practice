import 'package:flutter/material.dart';

class Myhome2 extends StatefulWidget {
  Myhome2({Key? key}) : super(key: key);

  @override
  _Myhome2State createState() => _Myhome2State();
}

class _Myhome2State extends State<Myhome2> {
  final _formKey = GlobalKey<FormState>();
  var name = "";
  var email = "";
  var passwd = "";
  final nameController = TextEditingController();
  final emailController = TextEditingController();
  final passwdController = TextEditingController();
  @override
  Widget build(BuildContext context) {
    return Form(
      key: _formKey,
      child: Padding(
          padding: EdgeInsets.symmetric(vertical: 20, horizontal: 20),
          child: ListView(
            children: [
              TextFormField(
                decoration: InputDecoration(
                    labelText: "Name :",
                    labelStyle: TextStyle(fontSize: 25),
                    errorStyle:
                        TextStyle(fontSize: 30, color: Colors.redAccent)),
                controller: nameController,
                validator: (value) {
                  if (value.toString().trim() == null ||
                      value.toString().trim().length == 0) {
                    return "Plz Enter Value";
                  }
                  return null;
                },
              ),
              TextFormField(
                obscureText: true,
                decoration: InputDecoration(
                  labelText: "Password :",
                  labelStyle: TextStyle(fontSize: 25),
                ),
                controller: passwdController,
                validator: (value) {
                  if (value.toString().trim() == null ||
                      value.toString().trim().length == 0) {
                    return "Plz Enter Value";
                  }
                  return null;
                },
              ),
              TextFormField(
                decoration: InputDecoration(
                  labelText: "Email :",
                  labelStyle: TextStyle(fontSize: 25),
                ),
                controller: emailController,
                validator: (value) {
                  if (value.toString().trim() == null) {
                    return "Plz Enter Value";
                  }

                  return null;
                },
              ),
              ElevatedButton(
                onPressed: () {
                  if (_formKey.currentState!.validate()) {
                    setState(() {
                      name = nameController.text;
                      email = emailController.text;
                      passwd = passwdController.text;
                    });

                    ScaffoldMessenger.of(context).showSnackBar(
                      const SnackBar(content: Text('Processing Data')),
                    );
                  }
                },
                child: const Text('Submit'),
              ),
              Text("Email: $email"),
              Text("Name: $name"),
              Text("Password: $passwd"),
            ],
          )),
    );
  }
}
