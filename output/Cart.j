.class public Cart
.super java/lang/Object
		 
.field orders LList;
		
.method public <init>()V
.limit stack 128
.limit locals 128
		aload 0
		invokespecial java/lang/Object/<init>()V
		aload 0
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 0
		aload 0
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 1
		aload 1
		ldc ""
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 1
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 1
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		new List
		dup
		aload 1
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 0
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 1
		aload 1
		ldc ""
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 1
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 1
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		new List
		dup
		aload 1
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 0
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 1
		aload 1
		ldc ""
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 1
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 1
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		new List
		dup
		aload 1
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 0
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 1
		aload 1
		ldc ""
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 1
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 1
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		new List
		dup
		aload 1
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		new List
		dup
		aload 0
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		putfield Cart/orders LList;
		return
.end method
		 
.method public addToCart(LList;Ljava/lang/Integer;)V
.limit stack 128
.limit locals 128
		aload 0
		getfield Cart/orders LList;
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		new List
		dup
		aload 1
		invokespecial List/<init>(LList;)V
		dup_x2
		invokevirtual List/setElement(ILjava/lang/Object;)V
		pop
		return
.end method
		 
.method public getReceipt()V
.limit stack 128
.limit locals 128
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 1
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 2
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 4
		aload 4
		ldc ""
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 4
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 4
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		new List
		dup
		aload 4
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		astore 3
		ldc 0
		dup
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 1
		pop
		ldc 0
		istore 4
	Label_0:
		iload 4
		aload 0
		getfield Cart/orders LList;
		getfield List/elements Ljava/util/ArrayList;
		invokevirtual java/util/ArrayList/size()I
		if_icmpge Label_1
		aload 0
		getfield Cart/orders LList;
		iload 4
		invokevirtual List/getElement(I)Ljava/lang/Object;
		checkcast List
		astore 3
		iinc 4 1
		aload 3
		ldc 1
		invokevirtual List/getElement(I)Ljava/lang/Object;
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		aload 3
		ldc 2
		invokevirtual List/getElement(I)Ljava/lang/Object;
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		imul
		dup
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 2
		pop
		aload 1
		invokevirtual java/lang/Integer/intValue()I
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		iadd
		dup
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 1
		pop
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 3
		ldc 0
		invokevirtual List/getElement(I)Ljava/lang/Object;
		checkcast java/lang/String
		invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc ", "
		invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/io/PrintStream/print(I)V
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "\n"
		invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
		goto Label_0
	Label_1:
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 1
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/io/PrintStream/print(I)V
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "\n"
		invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
		return
.end method
		 
