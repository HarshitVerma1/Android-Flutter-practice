import 'package:flutter/material.dart';

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
      ),
    );
  }
}
