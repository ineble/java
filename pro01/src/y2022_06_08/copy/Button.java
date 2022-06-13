package y2022_06_08.copy;

public class Button {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	
	static interface OnClickListener{
		void onClick();
	}
	
}
