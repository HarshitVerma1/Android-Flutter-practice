import 'package:flutter/material.dart';

class Myhome2 extends StatefulWidget {
  Myhome2({Key? key}) : super(key: key);

  @override
  _Myhome2State createState() => _Myhome2State();
}

class _Myhome2State extends State<Myhome2> {
  @override
  Widget build(BuildContext context) {
    return Container(
        child: Text("Harshit Verma",
            textDirection: TextDirection.ltr,
            style: TextStyle(fontSize: 20),
            textAlign: TextAlign.center));
  }
}
