package lejos.pc.comm;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class NXTCommOpenGL implements NXTComm {

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public byte[] sendRequest(byte[] message, int replyLen) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NXTInfo[] search(String name) throws NXTCommException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean open(NXTInfo nxt, int mode) throws NXTCommException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean open(NXTInfo nxt) throws NXTCommException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public byte[] read() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int available() throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void write(byte[] data) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public OutputStream getOutputStream() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InputStream getInputStream() {
		// TODO Auto-generated method stub
		return null;
	}

}
