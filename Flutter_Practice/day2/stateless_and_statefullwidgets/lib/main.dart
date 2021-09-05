import 'dart:ui';

import 'package:flutter/material.dart';
import 'app_screens/home.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        title: "Myself",
        home: Scaffold(
            appBar: AppBar(
              title: Text(
                "App Bar Text",
                textDirection: TextDirection.ltr,
              ),
            ),
            backgroundColor: Colors.blueAccent,
            body: Center(
                child: SizedBox(
              height: 410,
              child: Card(
                  child: Card(
                child: Padding(
                    padding: EdgeInsets.all(10),
                    child: Column(children: [
                      Image(
                        image: AssetImage("images/indianflag.jpg"),
                        fit: BoxFit.fill,
                      ),
                      Divider(),
                      Text(
                        "My India!\nMy Pride!",
                        style: TextStyle(fontSize: 20, color: Colors.teal),
                      ),
                      Divider(),
                      // TextButton
                      ElevatedButton(
                        onPressed: () {
                          print("Radhe! Radhe!");
                        },
                        child: Text("Click Me!!"),
                        style: ElevatedButton.styleFrom(
                            //     primary: Colors.black,
                            //     // backgroundColor: Colors.amberAccent,
                            textStyle: TextStyle(fontSize: 25),
                            padding: EdgeInsets.all(10)),
                      )
                    ])),
              )),
            ))));
  }
}
