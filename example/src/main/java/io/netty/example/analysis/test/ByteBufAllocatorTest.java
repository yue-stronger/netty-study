package io.netty.example.analysis.test;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;

public class ByteBufAllocatorTest {

	public static void main(String[] args) {
		ByteBuf byteBuf = ByteBufAllocator.DEFAULT.heapBuffer(5);
		byteBuf.release();
	}
}
