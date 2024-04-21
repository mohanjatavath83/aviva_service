How authentication via Magic Link works?
https://implementing.substack.com/p/how-to-implement-a-magic-link-authentication


1. User starts the registration process by entering their email address.
2. Client calls the server's registration API by sending the email.
3. The server creates a “sign in” token by including the email in the JWT token claim.
4. The server uses the email service to send the user an email with a link to a client page. This link includes the JWT “sign in“ token.
5. The email sending service confirms the sending of the email to the user.
6. The server API replies to the client.
7. The client displays a message to the user, informing them that they need to check their email to proceed with authentication to the system.
8. The user clicks on the link received via email and is directed to a client page.
9. The client retrieves the email from the URL and sends it to another backend API for authentication.
10. The server verifies the 'sign-in' token's authenticity by ensuring that it has not expired.
11. The user's email is extracted from the claim of the “sign-in” token.
12. The server queries the database to check if the user has registered before.
13. The database replies to the server with the search results.
14. If the user is not already registered, a new record is created in the database using this email.
15. The database replies to the server with the insert results.
16. An “authentication” token is created to authenticate client requests to the server. This token includes the user's ID in the claim.
17. The server API responds to the client with the "authentication" token.
18. The user accesses the platform.How authentication via Magic Link works?
                                   
                                   
                                  