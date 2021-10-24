import 'package:flutter/material.dart';

class My extends StatefulWidget {
  My({Key? key}) : super(key: key);

  @override
  _MyState createState() => _MyState();
}

class _MyState extends State<My> {
  String name = "";
  @override
  Widget build(BuildContext context) {
    return Center(
      child: Column(
        children: [
          TextField(
            onChanged: (value) {
              setState(() {
                name = value;
              });
            },
          ),
          Text(
            name,
            textDirection: TextDirection.ltr,
            style: TextStyle(fontSize: 20),
          )
        ],
      ),
    );
  }
}
