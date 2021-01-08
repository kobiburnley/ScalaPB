// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package scalapb.options

/** @param collectionType
  *   Can be specified only if this field is repeated. If unspecified,
  *   it falls back to the file option named `collection_type`, which defaults
  *   to `scala.collection.Seq`.
  * @param keyType
  *   If the field is a map, you can specify custom Scala types for the key
  *   or value.
  * @param annotations
  *   Custom annotations to add to the field.
  * @param mapType
  *   Can be specified only if this field is a map. If unspecified,
  *   it falls back to the file option named `map_type` which defaults to
  *   `scala.collection.immutable.Map`
  * @param noBox
  *   Do not box this value in Option[T]. If set, this overrides MessageOptions.no_box
  */
@SerialVersionUID(0L)
final case class FieldOptions(
    `type`: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
    scalaName: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
    collectionType: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
    collection: _root_.scala.Option[scalapb.options.Collection] = _root_.scala.None,
    keyType: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
    valueType: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
    annotations: _root_.scala.Seq[_root_.scala.Predef.String] = _root_.scala.Seq.empty,
    mapType: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
    noBox: _root_.scala.Option[_root_.scala.Boolean] = _root_.scala.None,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[FieldOptions] with _root_.scalapb.ExtendableMessage[FieldOptions] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (`type`.isDefined) {
        val __value = `type`.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
      };
      if (scalaName.isDefined) {
        val __value = scalaName.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
      };
      if (collectionType.isDefined) {
        val __value = collectionType.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, __value)
      };
      if (collection.isDefined) {
        val __value = collection.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      if (keyType.isDefined) {
        val __value = keyType.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(4, __value)
      };
      if (valueType.isDefined) {
        val __value = valueType.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(5, __value)
      };
      annotations.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(6, __value)
      }
      if (mapType.isDefined) {
        val __value = mapType.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(7, __value)
      };
      if (noBox.isDefined) {
        val __value = noBox.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(30, __value)
      };
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      `type`.foreach { __v =>
        val __m = __v
        _output__.writeString(1, __m)
      };
      scalaName.foreach { __v =>
        val __m = __v
        _output__.writeString(2, __m)
      };
      collectionType.foreach { __v =>
        val __m = __v
        _output__.writeString(3, __m)
      };
      keyType.foreach { __v =>
        val __m = __v
        _output__.writeString(4, __m)
      };
      valueType.foreach { __v =>
        val __m = __v
        _output__.writeString(5, __m)
      };
      annotations.foreach { __v =>
        val __m = __v
        _output__.writeString(6, __m)
      };
      mapType.foreach { __v =>
        val __m = __v
        _output__.writeString(7, __m)
      };
      collection.foreach { __v =>
        val __m = __v
        _output__.writeTag(8, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      noBox.foreach { __v =>
        val __m = __v
        _output__.writeBool(30, __m)
      };
      unknownFields.writeTo(_output__)
    }
    def getType: _root_.scala.Predef.String = `type`.getOrElse("")
    def clearType: FieldOptions = copy(`type` = _root_.scala.None)
    def withType(__v: _root_.scala.Predef.String): FieldOptions = copy(`type` = Option(__v))
    def getScalaName: _root_.scala.Predef.String = scalaName.getOrElse("")
    def clearScalaName: FieldOptions = copy(scalaName = _root_.scala.None)
    def withScalaName(__v: _root_.scala.Predef.String): FieldOptions = copy(scalaName = Option(__v))
    def getCollectionType: _root_.scala.Predef.String = collectionType.getOrElse("")
    def clearCollectionType: FieldOptions = copy(collectionType = _root_.scala.None)
    def withCollectionType(__v: _root_.scala.Predef.String): FieldOptions = copy(collectionType = Option(__v))
    def getCollection: scalapb.options.Collection = collection.getOrElse(scalapb.options.Collection.defaultInstance)
    def clearCollection: FieldOptions = copy(collection = _root_.scala.None)
    def withCollection(__v: scalapb.options.Collection): FieldOptions = copy(collection = Option(__v))
    def getKeyType: _root_.scala.Predef.String = keyType.getOrElse("")
    def clearKeyType: FieldOptions = copy(keyType = _root_.scala.None)
    def withKeyType(__v: _root_.scala.Predef.String): FieldOptions = copy(keyType = Option(__v))
    def getValueType: _root_.scala.Predef.String = valueType.getOrElse("")
    def clearValueType: FieldOptions = copy(valueType = _root_.scala.None)
    def withValueType(__v: _root_.scala.Predef.String): FieldOptions = copy(valueType = Option(__v))
    def clearAnnotations = copy(annotations = _root_.scala.Seq.empty)
    def addAnnotations(__vs: _root_.scala.Predef.String*): FieldOptions = addAllAnnotations(__vs)
    def addAllAnnotations(__vs: Iterable[_root_.scala.Predef.String]): FieldOptions = copy(annotations = annotations ++ __vs)
    def withAnnotations(__v: _root_.scala.Seq[_root_.scala.Predef.String]): FieldOptions = copy(annotations = __v)
    def getMapType: _root_.scala.Predef.String = mapType.getOrElse("")
    def clearMapType: FieldOptions = copy(mapType = _root_.scala.None)
    def withMapType(__v: _root_.scala.Predef.String): FieldOptions = copy(mapType = Option(__v))
    def getNoBox: _root_.scala.Boolean = noBox.getOrElse(false)
    def clearNoBox: FieldOptions = copy(noBox = _root_.scala.None)
    def withNoBox(__v: _root_.scala.Boolean): FieldOptions = copy(noBox = Option(__v))
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => `type`.orNull
        case 2 => scalaName.orNull
        case 3 => collectionType.orNull
        case 8 => collection.orNull
        case 4 => keyType.orNull
        case 5 => valueType.orNull
        case 6 => annotations
        case 7 => mapType.orNull
        case 30 => noBox.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => `type`.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => scalaName.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 3 => collectionType.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 8 => collection.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 4 => keyType.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 5 => valueType.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 6 => _root_.scalapb.descriptors.PRepeated(annotations.iterator.map(_root_.scalapb.descriptors.PString(_)).toVector)
        case 7 => mapType.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 30 => noBox.map(_root_.scalapb.descriptors.PBoolean(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = scalapb.options.FieldOptions
    // @@protoc_insertion_point(GeneratedMessage[scalapb.FieldOptions])
}

object FieldOptions extends scalapb.GeneratedMessageCompanion[scalapb.options.FieldOptions] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[scalapb.options.FieldOptions] = this
  def merge(`_message__`: scalapb.options.FieldOptions, `_input__`: _root_.com.google.protobuf.CodedInputStream): scalapb.options.FieldOptions = newBuilder(_message__).merge(_input__).result()
  implicit def messageReads: _root_.scalapb.descriptors.Reads[scalapb.options.FieldOptions] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      scalapb.options.FieldOptions(
        `type` = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]),
        scalaName = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]),
        collectionType = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]),
        collection = __fieldsMap.get(scalaDescriptor.findFieldByNumber(8).get).flatMap(_.as[_root_.scala.Option[scalapb.options.Collection]]),
        keyType = __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]),
        valueType = __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]),
        annotations = __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).map(_.as[_root_.scala.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.Seq.empty),
        mapType = __fieldsMap.get(scalaDescriptor.findFieldByNumber(7).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]),
        noBox = __fieldsMap.get(scalaDescriptor.findFieldByNumber(30).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Boolean]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ScalapbProto.javaDescriptor.getMessageTypes().get(3)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ScalapbProto.scalaDescriptor.messages(3)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 8 => __out = scalapb.options.Collection
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = scalapb.options.FieldOptions(
    `type` = _root_.scala.None,
    scalaName = _root_.scala.None,
    collectionType = _root_.scala.None,
    collection = _root_.scala.None,
    keyType = _root_.scala.None,
    valueType = _root_.scala.None,
    annotations = _root_.scala.Seq.empty,
    mapType = _root_.scala.None,
    noBox = _root_.scala.None
  )
  final class Builder private (
    private var __type: _root_.scala.Option[_root_.scala.Predef.String],
    private var __scalaName: _root_.scala.Option[_root_.scala.Predef.String],
    private var __collectionType: _root_.scala.Option[_root_.scala.Predef.String],
    private var __collection: _root_.scala.Option[scalapb.options.Collection],
    private var __keyType: _root_.scala.Option[_root_.scala.Predef.String],
    private var __valueType: _root_.scala.Option[_root_.scala.Predef.String],
    private var __annotations: _root_.scala.collection.mutable.Builder[_root_.scala.Predef.String, _root_.scala.Seq[_root_.scala.Predef.String]],
    private var __mapType: _root_.scala.Option[_root_.scala.Predef.String],
    private var __noBox: _root_.scala.Option[_root_.scala.Boolean],
    private var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder
  ) extends _root_.scalapb.MessageBuilder[scalapb.options.FieldOptions] {
    def merge(`_input__`: _root_.com.google.protobuf.CodedInputStream): this.type = {
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __type = Option(_input__.readStringRequireUtf8())
          case 18 =>
            __scalaName = Option(_input__.readStringRequireUtf8())
          case 26 =>
            __collectionType = Option(_input__.readStringRequireUtf8())
          case 66 =>
            __collection = Option(__collection.fold(_root_.scalapb.LiteParser.readMessage[scalapb.options.Collection](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
          case 34 =>
            __keyType = Option(_input__.readStringRequireUtf8())
          case 42 =>
            __valueType = Option(_input__.readStringRequireUtf8())
          case 50 =>
            __annotations += _input__.readStringRequireUtf8()
          case 58 =>
            __mapType = Option(_input__.readStringRequireUtf8())
          case 240 =>
            __noBox = Option(_input__.readBool())
          case tag =>
            if (_unknownFields__ == null) {
              _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
            }
            _unknownFields__.parseField(tag, _input__)
        }
      }
      this
    }
    def result(): scalapb.options.FieldOptions = {
      scalapb.options.FieldOptions(
          `type` = __type,
          scalaName = __scalaName,
          collectionType = __collectionType,
          collection = __collection,
          keyType = __keyType,
          valueType = __valueType,
          annotations = __annotations.result(),
          mapType = __mapType,
          noBox = __noBox,
          unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
      )
    }
  }
  object Builder extends _root_.scalapb.MessageBuilderCompanion[scalapb.options.FieldOptions, scalapb.options.FieldOptions.Builder] {
    def apply(): Builder = new Builder(
      __type = _root_.scala.None,
      __scalaName = _root_.scala.None,
      __collectionType = _root_.scala.None,
      __collection = _root_.scala.None,
      __keyType = _root_.scala.None,
      __valueType = _root_.scala.None,
      __annotations = _root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Predef.String],
      __mapType = _root_.scala.None,
      __noBox = _root_.scala.None,
      `_unknownFields__` = null
    )
    def apply(`_message__`: scalapb.options.FieldOptions): Builder = new Builder(
      __type = _message__.`type`,
      __scalaName = _message__.scalaName,
      __collectionType = _message__.collectionType,
      __collection = _message__.collection,
      __keyType = _message__.keyType,
      __valueType = _message__.valueType,
      __annotations = _root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Predef.String] ++= _message__.annotations,
      __mapType = _message__.mapType,
      __noBox = _message__.noBox,
      `_unknownFields__` = new _root_.scalapb.UnknownFieldSet.Builder(_message__.unknownFields)
    )
  }
  def newBuilder: Builder = scalapb.options.FieldOptions.Builder()
  def newBuilder(`_message__`: scalapb.options.FieldOptions): Builder = scalapb.options.FieldOptions.Builder(_message__)
  implicit class FieldOptionsLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, scalapb.options.FieldOptions]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, scalapb.options.FieldOptions](_l) {
    def `type`: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getType)((c_, f_) => c_.copy(`type` = Option(f_)))
    def optionalType: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.`type`)((c_, f_) => c_.copy(`type` = f_))
    def scalaName: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getScalaName)((c_, f_) => c_.copy(scalaName = Option(f_)))
    def optionalScalaName: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.scalaName)((c_, f_) => c_.copy(scalaName = f_))
    def collectionType: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getCollectionType)((c_, f_) => c_.copy(collectionType = Option(f_)))
    def optionalCollectionType: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.collectionType)((c_, f_) => c_.copy(collectionType = f_))
    def collection: _root_.scalapb.lenses.Lens[UpperPB, scalapb.options.Collection] = field(_.getCollection)((c_, f_) => c_.copy(collection = Option(f_)))
    def optionalCollection: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[scalapb.options.Collection]] = field(_.collection)((c_, f_) => c_.copy(collection = f_))
    def keyType: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getKeyType)((c_, f_) => c_.copy(keyType = Option(f_)))
    def optionalKeyType: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.keyType)((c_, f_) => c_.copy(keyType = f_))
    def valueType: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getValueType)((c_, f_) => c_.copy(valueType = Option(f_)))
    def optionalValueType: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.valueType)((c_, f_) => c_.copy(valueType = f_))
    def annotations: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Predef.String]] = field(_.annotations)((c_, f_) => c_.copy(annotations = f_))
    def mapType: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getMapType)((c_, f_) => c_.copy(mapType = Option(f_)))
    def optionalMapType: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.mapType)((c_, f_) => c_.copy(mapType = f_))
    def noBox: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.getNoBox)((c_, f_) => c_.copy(noBox = Option(f_)))
    def optionalNoBox: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Boolean]] = field(_.noBox)((c_, f_) => c_.copy(noBox = f_))
  }
  final val TYPE_FIELD_NUMBER = 1
  final val SCALA_NAME_FIELD_NUMBER = 2
  final val COLLECTION_TYPE_FIELD_NUMBER = 3
  final val COLLECTION_FIELD_NUMBER = 8
  final val KEY_TYPE_FIELD_NUMBER = 4
  final val VALUE_TYPE_FIELD_NUMBER = 5
  final val ANNOTATIONS_FIELD_NUMBER = 6
  final val MAP_TYPE_FIELD_NUMBER = 7
  final val NO_BOX_FIELD_NUMBER = 30
  def of(
    `type`: _root_.scala.Option[_root_.scala.Predef.String],
    scalaName: _root_.scala.Option[_root_.scala.Predef.String],
    collectionType: _root_.scala.Option[_root_.scala.Predef.String],
    collection: _root_.scala.Option[scalapb.options.Collection],
    keyType: _root_.scala.Option[_root_.scala.Predef.String],
    valueType: _root_.scala.Option[_root_.scala.Predef.String],
    annotations: _root_.scala.Seq[_root_.scala.Predef.String],
    mapType: _root_.scala.Option[_root_.scala.Predef.String],
    noBox: _root_.scala.Option[_root_.scala.Boolean]
  ): _root_.scalapb.options.FieldOptions = _root_.scalapb.options.FieldOptions(
    `type`,
    scalaName,
    collectionType,
    collection,
    keyType,
    valueType,
    annotations,
    mapType,
    noBox
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[scalapb.FieldOptions])
}
