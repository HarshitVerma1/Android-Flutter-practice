import 'package:flutter/material.dart';
import 'package:day6/app_screens/home.dart';
import 'package:day6/app_screens/home2.dart';

void main() {
  runApp(myHome());
}

class myHome extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: "AppTitle",
      home: Scaffold(
          appBar: AppBar(
            title: Text("My AppBar"),
          ),
          body: Myhome2()),
    );
  }
}
