import QtQuick 2.2

import "./path/to/dirictory/"


Rectangle {
    id: root
    q: e //i: 3

    Item {
        Item {
            color: "black"
//            import QtQuick 2.2 // Must be failed if uncomment
        }
    }
    property var test: 3
    function d(){
        let qwe2;;;;

        {return qsTranslate("q"
        ,
        "w");}
        let qwe = 33;
    }

    enum SomeType {
        Value1,
        Value2
     }
//    enum SomeType2 {
//        Value1,  // must be failed if uncomment
//    }
    onTestChanged: print(test)


    property real x: 22 /* */
    property var xxx
    property var theArray: []
    property var theArray: ["123", call(), object.ref]
    property var theDate: new Date()
//    readonly property alias y: 0  // must be failed if uncomment
    readonly property alias y: q
    /*  ; /* */

    property alias buttonText: textItem.text

    Behavior on opacity {
        NumberAnimation { duration: 300 }
    }

    Rectangle {
        width: 100; height: 30
        enabled: !root.enabled
        model: []
        color: root.selected || !enabled ? "#f03c72": "#4f4090"
        readonly property var test: root.width
                                        ||
                                       null

        signal processInput(int text, var i)
        signal processInput
        signal processInput()
    }

    function test() {  }
    function test3() {
            {
              22
            }
     }
    function test() { ; }
    function loadNextScene(userAuthorization){
        let qwe
        let qwe = 33;
        mainStackView.replace(userAuthorization)
        intro.destroy()

        "jkkj" * 3
    }

   MouseArea {
        anchors.fill: parent
        onClicked: label.moveTo(mouse.x, mouse.y)
    }

    function moveTo(newX, newY) {
        console.log(newX, newY)
    }
}

