public class Output {
	
	InputData inputdata = new InputData();
	LotteWorldFunction lwf = new LotteWorldFunction();
	
	public void ticketOut() {
		System.out.println("������ �����ϼ���");
		System.out.println("1. �ְ��� ");
		System.out.println("2. �߰��� ");
		inputdata.setSelectDayOrNight();
	}

	public void registrationOut() {	
		System.out.println("������� 8�ڸ��� �Է��ϼ���.(YYYYMMDD)");
		inputdata.setResidentRegistrationNumber();
	}

	public void numberOfTicketOut() {
		System.out.println("��� �ֹ��Ͻðڽ��ϱ�? (�ִ� 10��)");
		inputdata.setNumberOfTicket();
	}

	public void preferOut() {
		System.out.println("�������� �����ϼ���.");
		System.out.println("1. ���� (���� ���� �ڵ�ó��)");
		System.out.println("2. �����");
		System.out.println("3. ����������");
		System.out.println("4. ���ڳ�");
		System.out.println("5. �ӻ��");
		inputdata.setSelectPrefer();
	}
	public void finPriceOut() {
		LotteWorldFunction lwf = new LotteWorldFunction();
		System.out.printf("������ %d �� �Դϴ�.\n", lwf.getPayment());
		System.out.println("�����մϴ�.");

	}
	public void continueOut() {
		System.out.println("��� �߱��Ͻðڽ��ϱ�?\n");
		System.out.println("1. Ƽ�� �߱�\n");
		System.out.println("2. ����\n");
		inputdata.setInputSelectNumber();
	}
	
	public void sumTicketPrice() {
		System.out.printf("Ƽ�� �߱��� �����մϴ�. �����մϴ�.\n");
		System.out.printf("============ �Ե����� ============\n");
		System.out.printf("\n����� �Ѿ��� %d �� �Դϴ�.\n",lwf.getSumTicketCost());
		System.out.printf("===============================\n");
	}
}
