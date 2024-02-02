class BinarySearch
  attr_accessor :array, :length

  def initialize(array)
    self.array = array
    self.length = array.length
  end

  def search(value)
    low, high = 0, length

    while low <= high
      mid = (low + high) / 2;
      if array[mid] == value
        return mid
      elsif array[mid] > value
        high = mid - 1
      else
        low = mid + 1
      end
    end
  end
end
