import 'package:flutter/material.dart';
// import 'package:url_launcher/url_launcher.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'BellGang Task',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: const MyHomePage(title: 'Flutter Demo Home Page'),
    );
  }
}

class MyHomePage extends StatefulWidget {
  const MyHomePage({Key? key, required this.title}) : super(key: key);

  final String title;

  @override
  State<MyHomePage> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Stack(
        children: [
          Container(
            decoration: BoxDecoration(
                gradient: LinearGradient(
              begin: Alignment.topRight,
              end: Alignment.bottomLeft,
              colors: [
                Color(0xffddd6f3),
                // Color(0xFFCF5CCF),
                // Color(0xFFFF57AC),
                // Color(0xFFFF6D91),
                // Color(0xFFFF8D7E),
                Color(0xfffaaca8),
              ],
              stops: [0.05, 1], //stops: [0.05, 0.3, 0.5, 0.55, 0.8,  1]
            )),
          ),
          Directionality(
              textDirection: TextDirection.ltr,
              child: ListView(
                children: [
                  ListTile(
                    contentPadding: EdgeInsets.all(20),
                    leading: Image(
                      image: AssetImage('images/logo.png'),
                      alignment: Alignment.topLeft,
                      height: 300,
                      width: 300,
                    ),
                    trailing: Text(
                      "Login",
                      style: TextStyle(
                          fontSize: 20,
                          decoration: TextDecoration.underline,
                          color: Colors.brown),
                    ),
                  ),
                  // Divider(
                  //   color: Colors.black,
                  // )
                  Row(
                    children: [
                      Column(
                        children: [
                          Container(
                              margin: EdgeInsets.all(40),
                              child: Text(
                                "Figure out who your real Suppoters are ",
                                style: TextStyle(
                                  fontSize: 40,
                                  fontFamily: 'BalsamiqSans',
                                  fontWeight: FontWeight.w700,
                                ),
                              ))
                        ],
                      ),
                      Container(
                        margin: EdgeInsets.only(top: 20),
                        child: Image(
                          image: AssetImage('images/png1.png'),
                          height: 600,
                        ),
                      ),
                      Container(
                        margin: EdgeInsets.only(top: 20),
                        child: Image(
                          image: AssetImage('images/png2.png'),
                          height: 600,
                        ),
                      )
                    ],
                  ),
                  SizedBox(
                    height: 50,
                  ),
                  Divider(
                    color: Colors.black,
                  )
                ],
              ))
        ],
      ),
    );
  }
}
