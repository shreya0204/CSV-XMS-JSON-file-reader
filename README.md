# CSV-XMS-JSON-file-reader

web application - a tool for uploading Excel, CSV, JSON files from the disk, which later displays the content of the uploaded data records on the GUI
 if another file is uploaded, UPDATE is done and the list of displayed records is updated. I added in every record
 field what file type, e.g. XLS / XLSX, CSV, JSON. If empty it will add empty content. All read records are added
to MySQL database -> database-> readfiledata, table -> policy.