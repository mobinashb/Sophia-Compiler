.class public Main
.super java/lang/Object
		 
		
.method public static main([Ljava/lang/String;)V
.limit stack 128
.limit locals 128
		new Main
		invokespecial Main/<init>()V
		return
.end method
		 
.method public <init>()V
.limit stack 128
.limit locals 128
		aload 0
		invokespecial java/lang/Object/<init>()V
		aconst_null
		astore 1
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 2
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 6
		aload 6
		ldc ""
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 6
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 6
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		new List
		dup
		aload 6
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		astore 3
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 6
		aload 6
		ldc ""
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 6
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		new List
		dup
		aload 6
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		astore 4
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 6
		aload 6
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 7
		aload 7
		ldc ""
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 7
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		new List
		dup
		aload 7
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 6
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 7
		aload 7
		ldc ""
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 7
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		new List
		dup
		aload 7
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 6
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 7
		aload 7
		ldc ""
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 7
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		new List
		dup
		aload 7
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 6
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 7
		aload 7
		ldc ""
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 7
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		new List
		dup
		aload 7
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		new List
		dup
		aload 6
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		astore 5
		new List
		dup
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 6
		aload 6
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 7
		aload 7
		ldc "Doughnut"
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 7
		ldc 5000
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		new List
		dup
		aload 7
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 6
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 7
		aload 7
		ldc "Croissant"
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 7
		ldc 4000
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		new List
		dup
		aload 7
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 6
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 7
		aload 7
		ldc "Cookies"
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 7
		ldc 2000
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		new List
		dup
		aload 7
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 6
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 7
		aload 7
		ldc "Chocolate Cake"
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 7
		ldc 8000
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		new List
		dup
		aload 7
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		new List
		dup
		aload 6
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		invokespecial List/<init>(LList;)V
		dup
		astore 5
		pop
		new Cart
		dup
		invokespecial Cart/<init>()V
		dup
		astore 1
		pop
		ldc 0
		dup
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 2
		pop
		ldc 0
		istore 6
	Label_2:
		iload 6
		aload 5
		getfield List/elements Ljava/util/ArrayList;
		invokevirtual java/util/ArrayList/size()I
		if_icmpge Label_3
		aload 5
		iload 6
		invokevirtual List/getElement(I)Ljava/lang/Object;
		checkcast List
		astore 4
		iinc 6 1
		new List
		dup
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 7
		aload 7
		aload 4
		ldc 0
		invokevirtual List/getElement(I)Ljava/lang/Object;
		checkcast java/lang/String
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 7
		aload 4
		ldc 1
		invokevirtual List/getElement(I)Ljava/lang/Object;
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 7
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		ldc 1
		iadd
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		new List
		dup
		aload 7
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		invokespecial List/<init>(LList;)V
		dup
		astore 3
		pop
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 7
		aload 7
		aload 3
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 7
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		new Fptr
		dup
		aload 1
		ldc "addToCart"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		aload 7
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		pop
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		ldc 1
		iadd
		dup
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 2
		pop
		goto Label_2
	Label_3:
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 6
		new Fptr
		dup
		aload 1
		ldc "getReceipt"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		aload 6
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		pop
		return
.end method
		 
