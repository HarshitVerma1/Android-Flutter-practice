import 'package:flutter/material.dart';

void main() {
  runApp(
    MaterialApp(
      title: "Harshit",
      home: Scaffold(
          appBar: AppBar(
            title: Text(
              "Harshit Verma!",
              style: TextStyle(fontSize: 25),
            ),
            backgroundColor: Colors.blueAccent,
          ),
          backgroundColor: Colors.white,
          body: Image(
            image: AssetImage('images/logo.png'),
          )),
    ),
  );
}
