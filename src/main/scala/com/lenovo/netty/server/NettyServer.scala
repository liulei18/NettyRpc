package com.lenovo.netty.server

import io.netty.bootstrap.ServerBootstrap
import io.netty.channel.nio.NioEventLoopGroup

class NettyServer {

  def bind(host: String, port: Int): Unit = {
    //配置服务端线程池组
    //用于服务器接收客户端的连接
    val bossGroup = new NioEventLoopGroup()
    //用户进行SocketChannel的网络读写
    val workerGroup = new NioEventLoopGroup()

    try {
      //是Netty用户启动NIO服务端的辅助启动类，降低服务端的开发复杂度
      val bootstrap = new ServerBootstrap()
      //将两个NIO线程组作为参数传入到ServerBootstrap
    }
  }
}
