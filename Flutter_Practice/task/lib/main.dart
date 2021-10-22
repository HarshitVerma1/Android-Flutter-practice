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
                          fontSize: 23,
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
                        crossAxisAlignment: CrossAxisAlignment.start,
                        children: [
                          Container(
                              width: 800,
                              margin: EdgeInsets.only(
                                  top: 40, left: 40, right: 10, bottom: 10),
                              child: Text(
                                "Figure out who your real Supporters are ",
                                textDirection: TextDirection.ltr,
                                style: TextStyle(
                                  decoration: TextDecoration.none,
                                  color: Colors.brown,
                                  fontSize: 40,
                                  fontWeight: FontWeight.bold,
                                ),
                              )),
                          Container(
                              width: 800,
                              margin: EdgeInsets.only(left: 40),
                              child: Text(
                                "No Longer Reward Random viewers and give your Community another reason to come back ",
                                textDirection: TextDirection.ltr,
                                style: TextStyle(
                                  decoration: TextDecoration.none,
                                  fontSize: 30,
                                  fontFamily: 'Ubuntu',
                                  fontWeight: FontWeight.w100,
                                ),
                              )),
                          Container(
                            margin: EdgeInsets.only(left: 40, top: 10),
                            child: ElevatedButton(
                                child: Text("Get started with Google",
                                    style: TextStyle(fontSize: 30)),
                                style: ButtonStyle(
                                    padding:
                                        MaterialStateProperty.all<EdgeInsets>(
                                            EdgeInsets.all(15)),
                                    foregroundColor:
                                        MaterialStateProperty.all<Color>(
                                            Colors.white),
                                    backgroundColor:
                                        MaterialStateProperty.all<Color>(
                                            Colors.blueAccent),
                                    shape: MaterialStateProperty.all<RoundedRectangleBorder>(
                                        RoundedRectangleBorder(
                                            borderRadius:
                                                BorderRadius.all(Radius.circular(20)),
                                            side: BorderSide(color: Colors.red)))),
                                onPressed: () => null),
                          ),
                          Container(
                              margin:
                                  EdgeInsets.only(top: 15, left: 40, right: 10),
                              child: Text(
                                "We would love to speak to you :)",
                                textDirection: TextDirection.ltr,
                                style: TextStyle(
                                  decoration: TextDecoration.none,
                                  color: Colors.black,
                                  fontSize: 15,
                                ),
                              )),
                          Container(
                              margin: EdgeInsets.only(
                                  left: 40, right: 10, bottom: 10),
                              child: Text(
                                "Call or WhatsApp Vikram at +1 (203) 502-9558\nWhatsApp Rohan at:+91 99714 30120",
                                textDirection: TextDirection.ltr,
                                style: TextStyle(
                                  decoration: TextDecoration.underline,
                                  color: Colors.blue,
                                  fontSize: 15,
                                ),
                              ))
                        ],
                      ),
                      Container(
                        margin: EdgeInsets.only(top: 20),
                        child: Image(
                          image: AssetImage('images/png1.png'),
                          height: 580,
                        ),
                      ),
                      Container(
                        margin: EdgeInsets.only(top: 20, left: 20),
                        child: Image(
                          image: AssetImage('images/png2.png'),
                          height: 580,
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
