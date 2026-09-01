from flask import Flask,jsonify
app=Flask(__name__)
@app.route('/')
def home():
    return "web services"
@app.route('/hello')
def hello():
     return jsonify({"hello world"})
@app.route('/<int:a>/<int:b>')
def add(a,b):
    return jsonify({'result':a+b})
if __name__ == '__main__':
    app.run(host='0.0.0.0',port=5000,debug=True)