package homework;

import java.util.Date;

public class NoticeBoardDTO {
		private int nbNo;
		private String nbTitle;
		private String nbContent;
		private String nbWriter;
		private Date nbCreateDate;
		private int nbCnt;
		private String files;
		
	
			
		public NoticeBoardDTO(int nbNo, String nbTitle, String nbContent, String nbWriter, Date nbCreateDate, int nbCnt,
				String files) {
			this.nbNo = nbNo;
			this.nbTitle = nbTitle;
			this.nbContent = nbContent;
			this.nbWriter = nbWriter;
			this.nbCreateDate = nbCreateDate;
			this.nbCnt = nbCnt;
			this.files = files;
		}

		public NoticeBoardDTO() {
			
		}

		public int getNbNo() {
			return nbNo;
		}



		public void setNbNo(int nbNo) {
			this.nbNo = nbNo;
		}



		public String getNbTitle() {
			return nbTitle;
		}



		public void setNbTitle(String nbTitle) {
			this.nbTitle = nbTitle;
		}



		public String getNbContent() {
			return nbContent;
		}



		public void setNbContent(String nbContent) {
			this.nbContent = nbContent;
		}



		public String getNbWriter() {
			return nbWriter;
		}



		public void setNbWriter(String nbWriter) {
			this.nbWriter = nbWriter;
		}



		public Date getNbCreateDate() {
			return nbCreateDate;
		}



		public void setNbCreateDate(Date nbCreateDate) {
			this.nbCreateDate = nbCreateDate;
		}



		public int getNbCnt() {
			return nbCnt;
		}



		public void setNbCnt(int nbCnt) {
			this.nbCnt = nbCnt;
		}



		public String getFiles() {
			return files;
		}



		public void setFiles(String files) {
			this.files = files;
		}



		@Override
		public String toString() {
			return "NoticeBoardDTO [nbNo=" + nbNo + ", nbTitle=" + nbTitle + ", nbContent=" + nbContent + ", nbWriter="
					+ nbWriter + ", nbCreateDate=" + nbCreateDate + ", nbCnt=" + nbCnt + ", files=" + files
					+  "]";
		}

	

		
}


