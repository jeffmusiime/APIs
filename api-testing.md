## Effective

SOAP/XML vulnerabilities

Privilege escalation

CORS Misconfigurations
Endpoint Discovery

Parameter Tampering

HTTP Method Testing

Content Type Manipulation

Adavanced Parameter Techniques

Version Testing

## Kiterunner for endpoint discovery
kr scan http://127.0.0.1:5000 -w ~/Downloads/routes-large.kite -x 20

kr brute http://127.0.0.1:5000 -A=raft-large-words -x 20 -d=0

sj automate -u http://127.0.0.1:5000/swagger.json -qi -p http://127.0.0.1:5000


curl http://127.0.0.1:5000/api/swagger.json




  
