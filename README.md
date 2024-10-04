# quarkus-oidc-demo

A slightly modified version of [quarkus-quickstarts/security-openid-connect-web-authentication-quickstart](https://github.com/quarkusio/quarkus-quickstarts/tree/main/security-openid-connect-web-authentication-quickstart) that uses `Gradle`.

Try running it with 

```./gradlew quarkusDev --console=plain -DCONTEXT_PATH="/dev/" ```

it works, while wunning it with

```./gradlew quarkusDev --console=plain -PCONTEXT_PATH="/dev/" ```

(notice the `-P`) it doesn't.
