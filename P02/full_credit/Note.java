public class Note {
	private Pitch pitch;
	private int octave;	

	public Note() { pitch = null; }
	public Note(Pitch pitch, int octave) {
		this.pitch = pitch;
		this.octave = octave;

		if(-5 > octave) {
			octave = -5;
		}
		else if(octave > 4) {
			octave = 4;
		}
	}
	@Override
	public String toString() {
		if(pitch = null) {
			return " ";
		}
		else {
			return pitch + octave;
		}
	}
}
