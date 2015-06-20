# jitpack-scala-simple

Example Scala project

[![Release](https://img.shields.io/github/release/takumakei/jitpack-scala-simple.svg?label=JitPack)](https://jitpack.io/#takumakei/jitpack-scala-simple)

To use it in your `build.sbt` add:

<pre class="prettyprint">resolvers += "jitpack" at "https://jitpack.io"
libraryDependencies += "com.github.takumakei" %% "jitpack-scala-simple" % "<span id="latest_release"></span>"</pre>

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
      xmlhttp.open("GET", "https://api.github.com/repos/" user + "/" + repo + "/releases", true);
      xmlhttp.send();

      function populateRelease(arr) {
          var release = arr[0].tag_name;
          document.getElementById("latest_release").innerHTML = release;
      }
</script>
