import time
from selenium import webdriver
from selenium.webdriver.chrome.options import Options
from pyvirtualdisplay import Display

display = Display(visible=0, size=(800, 800))
display.start()

chrome_options = Options()
chrome_options.add_argument("--no-sandbox")
driver = webdriver.Chrome(chrome_options=chrome_options)

driver.get('http://g1.globo.com/')

title = driver.title
print(title.encode('utf-8'))

# html=driver.page_source
# print(html)

