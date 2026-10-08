<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Login Page</title>
        <style>
            body { font-family: Arial; display: flex; justify-content: center; align-items: center; min-height: 100vh; background: linear-gradient(135deg, #667eea, #764ba2); margin: 0; }
            .login-container { background: white; padding: 40px; border-radius: 12px; box-shadow: 0 20px 40px rgba(0,0,0,0.2); text-align: center; width: 350px; }
            h2 { color: #1b2a7a; margin-bottom: 25px; }
            input { padding: 12px; margin: 10px 0; width: 100%; border: 1px solid #ccc; border-radius: 6px; box-sizing: border-box; }
            button { background: #1b2a7a; color: white; padding: 12px; border: none; border-radius: 6px; cursor: pointer; width: 100%; font-size: 16px; }
        </style>
    </head>
    <body>
        <div class="login-container">
            <h2>System Login</h2>
            <form action="login" method="POST">
                <input type="text" name="username" placeholder="Enter username" required />
                <input type="password" name="password" placeholder="Enter password" required />
                <button type="submit">Login</button>
            </form>
        </div>
    </body>
</html>
