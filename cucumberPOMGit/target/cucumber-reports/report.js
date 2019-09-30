[
  {
    "line": 2,
    "elements": [
      {
        "start_timestamp": "2019-09-30T05:55:22.474Z",
        "line": 5,
        "name": "Login with Heroku App",
        "description": "",
        "id": "login-functionality;login-with-heroku-app",
        "type": "scenario",
        "keyword": "Scenario",
        "steps": [
          {
            "result": {
              "duration": 12950280200,
              "status": "passed"
            },
            "line": 6,
            "name": "user is on HerokuApp",
            "match": {
              "location": "LoginPomTest.user_is_on_HerokuApp()"
            },
            "keyword": "Given "
          },
          {
            "result": {
              "duration": 1141246500,
              "status": "passed"
            },
            "line": 7,
            "name": "user enters username and password",
            "match": {
              "location": "LoginPomTest.user_enters_username_and_password()"
            },
            "keyword": "When "
          },
          {
            "result": {
              "duration": 3226146200,
              "status": "passed"
            },
            "line": 8,
            "name": "user logged in successfully",
            "match": {
              "location": "LoginPomTest.user_logged_in_successfully()"
            },
            "keyword": "Then "
          }
        ],
        "tags": [
          {
            "name": "@functionalTest"
          },
          {
            "name": "@SmokeTest"
          }
        ]
      }
    ],
    "name": "Login functionality",
    "description": "",
    "id": "login-functionality",
    "keyword": "Feature",
    "uri": "file:features/loginPom.feature",
    "tags": [
      {
        "name": "@functionalTest",
        "type": "Tag",
        "location": {
          "line": 1,
          "column": 1
        }
      }
    ]
  }
]