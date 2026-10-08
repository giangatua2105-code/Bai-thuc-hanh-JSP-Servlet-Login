<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Login Page</title>
    <style>
      * {
        box-sizing: border-box;
        margin: 0;
        padding: 0;
      }
      body {
        font-family: Arial, sans-serif;
        display: flex;
        justify-content: center;
        align-items: center;
        min-height: 100vh;
        background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
      }
      .login-container {
        background: white;
        padding: 40px;
        border-radius: 12px;
        box-shadow: 0 20px 40px rgba(0, 0, 0, 0.2);
        text-align: center;
        width: 100%;
        max-width: 400px;
      }
      .login-container h2 {
        color: #1b2a7a;
        margin-bottom: 25px;
        font-size: 24px;
      }
      input {
        padding: 12px 15px;
        margin: 10px 0;
        width: 100%;
        border: 1px solid #ccc;
        border-radius: 6px;
        font-size: 14px;
        transition: border-color 0.3s;
      }
      input:focus {
        outline: none;
        border-color: #667eea;
      }
      button {
        background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
        color: white;
        padding: 12px 20px;
        border: none;
        border-radius: 6px;
        cursor: pointer;
        width: 100%;
        font-size: 16px;
        font-weight: bold;
        margin-top: 10px;
        transition: transform 0.2s;
      }
      button:hover {
        transform: translateY(-2px);
      }
    </style>
  </head>
  <body>
    <div class="login-container">
      <h2>System Login</h2>
      <!-- Form gửi dữ liệu bằng phương thức POST tới endpoint /login -->
      <form action="login" method="POST">
        <input
          type="text"
          name="username"
          placeholder="Enter username"
          required
        />
        <input
          type="password"
          name="password"
          placeholder="Enter password"
          required
        />
        <button type="submit">Login</button>
      </form>
    </div>
  </body>
</html>
