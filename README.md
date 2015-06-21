# jitpack-scala-simple

Example Scala project

[![v0.2_1.10](https://img.shields.io/badge/JitPack-v0.2_scala2.10-blue.svg)](https://jitpack.io/#takumakei/jitpack-scala-simple/v0.2_2.10) [![v0.2_1.11](https://img.shields.io/badge/JitPack-v0.2_scala2.11-blue.svg)](https://jitpack.io/#takumakei/jitpack-scala-simple/v0.2_2.11)

<!--
[![Release](https://img.shields.io/github/release/takumakei/jitpack-scala-simple.svg?label=JitPack)](https://jitpack.io/#takumakei/jitpack-scala-simple)
-->

To use it in your `build.sbt` add:

<pre class="prettyprint">resolvers += "jitpack" at "https://jitpack.io"<br><br>libraryDependencies += "com.github.takumakei" % "jitpack-scala-simple" % "<span id="latest_release">[release or commit]</span>"</pre>

<script>
      var user = 'takumakei';
      var repo = 'jitpack-scala-simple'

      var xmlhttp = new XMLHttpRequest();
      xmlhttp.onreadystatechange = function() {
          if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
              var myArr = JSON.parse(xmlhttp.responseText);
              populateRelease(myArr);
          }
      }
      xmlhttp.open("GET", "https://api.github.com/repos/" + user + "/" + repo + "/releases", true);
      xmlhttp.send();

      function populateRelease(arr) {
          var release = arr[0].tag_name;
          document.getElementById("latest_release").innerHTML = release;
      }
</script>

[https://jitpack.io/com/github/takumakei/jitpack-scala-simple/v0.2_2.10/build.log](https://jitpack.io/com/github/takumakei/jitpack-scala-simple/v0.2_2.10/build.log)

[https://jitpack.io/com/github/takumakei/jitpack-scala-simple/v0.2_2.11/build.log](https://jitpack.io/com/github/takumakei/jitpack-scala-simple/v0.2_2.11/build.log)
