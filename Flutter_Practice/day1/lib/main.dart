import 'package:flutter/material.dart';

void main() {
  runApp(MaterialApp(
    title: "Harshit",
    home: Container(
      decoration:
          BoxDecoration(borderRadius: BorderRadius.all(Radius.circular(20))),
      color: Colors.amberAccent,
      child: Text(
        "Harshit",
        textDirection: TextDirection.rtl,
      ),
    ),
  ));
}
