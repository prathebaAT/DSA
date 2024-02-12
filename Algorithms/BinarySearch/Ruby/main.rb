require_relative "binary_search"

if ARGV.length < 2
  puts "Usage: ruby binary_search_main.rb <sorted_array> <target_value>"
  exit
end

array = ARGV[0].split(",").map(&:to_i)
target = ARGV[1].to_i

binary_search = BinarySearch.new(array)
result = binary_search.search(target)

if result.nil?
  puts "#{target} not found in array"
else
  puts "#{target} found at #{result} index in array"
end
