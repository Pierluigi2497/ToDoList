/*!
\file Attivita.h
\brief definizione e implementazione della classe Attivita
*/

/*!
\brief classe per la rappresentazione di una singola attivita' di un progetto
*/

public class Attivita{

 	private String descrizione;
	 //! \brief descrizione dell'attivita' (la identifica univocamente nel progetto)
 	private Date scadenza;
	 //" \brief data di scadenza dell'attivita'
	private Date completamento; 
	 //! \brief data di completamento dell'attività (valida solo se svolgimento = 100)
	private int svolgimento; 
	 //! \brief percentuale di svolgimento dell'attivita' (0 - 100)
	 

 
	 //! \brief costruttore predefinito
	public Attivita(){
		 descrizione=new String("");
		 scadenza =new Date(); // 01-01-2000
		 completamento =new Date(); // 01-01-2000
		 svolgimento = 0;
	 }
	 /*! \brief costruttore
		 \param[in] descrizione descrizione dell'attivita'
		 \param[in] scadenza data di scadenza dell'attivita'
	 */
	public Attivita(String des, Date scad){
		 descrizione=new String(des);
		 scadenza=new Date(scad.getDay(),scad.getMonth(),scad.getYear());
		 completamento=new Date(); // 01-01-2000
		 svolgimento=0;
	 }
	 /*! \brief acquisizione descrizione dell'attivita'
		 \param[out] descrizione descrizione dell'attivita'
	 */
	public String getDescrizione(){
		 return descrizione;
	 }
	 /*! \brief acquisizione della data di scadenza dell'attivita'
		 \return data di scadenza dell'attivita'
	 */
	public Date getScadenza(){
		 return scadenza;
	 }
	 /*! \brief acquisizione della data di completamento dell'attivita'
		 \return data di completamento dell'attivita' (in caso di attivita' non completata restituisce la data 01-01-2000)
	 */
	public Date getCompletamento(){
		 return completamento;
	 }
	 /*! \brief acquisizione della percentuale di svolgimento dell'attivita'
		 \return percentuale di svolgimento dell'attivita'
	 */
	public int getSvolgimento(){
		 return svolgimento;
	 }
	 /*! \brief impostazione della percentuale di svolgimento dell'attivita'
		 \param[in] svolgimento percentuale di svolgimento dell'attivita'
		 \param[in] completamento data di completamento (significativa solo se svolgimento = 100)
	 */
	public void setSvoglimento(int svolg, Date comp){
		 if (svolgimento >= 100){
			 svolgimento=100;
			 completamento=comp;
		 }
		 else
			 svolgimento=svolg;
	 }
	 /*! \brief reimpostazione della data di scadenza dell'attivita'
	 	 \param[in] scadenza data di scadenza
	 */
	  public void setScadenza(Date scad){
		 scadenza=scad;
	 }
};
