# BrowserAutomationDSL

# EXAMPLE

PROCEDURE main
  play procedure pro_1 'DOSSIERS DE PRESSE'
  play procedure pro_1 'DOSSIERS DE PRESSE'
  play procedure pro_1 'DOSSIERS DE PRESSE'
  play procedure pro_1 'DOSSIERS DE PRESSE'
  play procedure pro_1 'DOSSIERS DE PRESSE'
  play procedure pro_1 'DOSSIERS DE PRESSE'

PROCEDURE pro_1 baseUrl
	open FIREFOX
  go to saved baseUrl
	click on BUTTON identified by LABEL 'test'
  fill TEXFIELD identified by ID 'mon_id' with 'Mon remplissage'
  check CHECKBOX identified by LABEL 'Je souscris à ce service'
  check all CHECKBOX identified by CLASS 'mes_cb_class'
  check all CHECKBOX
  uncheck all CHECKBOX
  select 'Option' in COMBOBOX identified by ID 'ma_combo_id'
  fill SEARCHFIELD with 'mot clé'
  read url from LINK identified by CLASS 'actu_home_ctner_inner_cell1_titre' and save in monUrl
  fill TEXTFIELD identified by ID 'mon_id' with saved monUrl
  count ELEMENT identified by TYPE 'TITLE1' and save in moncompte
  verify that PAGE contains 'mon truc'
  verify that TEXTFIELD identified by LABEL 'mon text' contains 'mon extrait'
  verify that PAGE contains saved monUrl
  verify that count ELEMENT identified by CLASS 'result' equals saved moncompte
  
PROCEDURE pro_2
	open firefox
	click on BUTTON with label 'test'

