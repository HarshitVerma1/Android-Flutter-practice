// ignore_for_file: prefer_const_literals_to_create_immutables

import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

void main() {
  runApp(MaterialApp(home: Home()));
}

class Home extends StatelessWidget {
  const Home({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        body: Padding(
      padding: const EdgeInsets.only(top: 100.0, left: 20),
      child: Column(
        children: [
          Row(children: [
            CircleAvatar(
              radius: 40,
            ),
            SizedBox(width: 20),
            Padding(
              padding: const EdgeInsets.only(left: 15.0),
              child: Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  Text(
                    "Harshit Verma",
                    style: TextStyle(fontSize: 30, fontWeight: FontWeight.bold),
                  ),
                  Text(
                    "Android Developer",
                    style: TextStyle(fontSize: 15),
                    textAlign: TextAlign.left,
                  )
                ],
              ),
            )
          ]),
          SizedBox(height: 50),
          Row(
            children: [
              Icon(Icons.school),
              SizedBox(width: 20),
              Text(
                "School Name, City",
                style: TextStyle(fontSize: 20, fontWeight: FontWeight.bold),
              ),
            ],
          ),
          Row(
            children: [
              Icon(Icons.computer_rounded),
              SizedBox(width: 20),
              Text(
                "Any Project",
                style: TextStyle(fontSize: 20, fontWeight: FontWeight.bold),
              ),
            ],
          ),
          Row(
            children: [
              Icon(Icons.my_location),
              SizedBox(width: 20),
              Text(
                "My Location",
                style: TextStyle(fontSize: 20, fontWeight: FontWeight.bold),
              ),
            ],
          ),
          Row(
            children: [
              Icon(Icons.email),
              SizedBox(width: 20),
              Text(
                "harshitverma.itsolution@gmail.com",
                style: TextStyle(fontSize: 20, fontWeight: FontWeight.bold),
              ),
            ],
          ),
          Row(
            children: [
              Icon(Icons.phone),
              SizedBox(width: 20),
              Text(
                "+91 8756969857",
                style: TextStyle(fontSize: 20, fontWeight: FontWeight.bold),
              ),
            ],
          )
        ],
      ),
    ));
  }
}
